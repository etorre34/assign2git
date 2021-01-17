package src.com.csc205.demos.module11;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToStringWrapper {
		 
		public String fieldB = "two";
		public String fieldC = "three";
		public String fieldA = "one";
		private int level = 45;
		
		public String toString() {
			
			StringBuilder b = new StringBuilder();
			
			b.append(this.getClass().getName());
			b.append(" [ ");
			
			Field[] fields = this.getClass().getDeclaredFields();
			List<Field>fieldList = Arrays.asList(fields);
			List<Field> sortedFieldList = fieldList.stream().sorted(Comparator.comparing(Field::getName)).collect(Collectors.toList());
			
			for (Field f : sortedFieldList) {
				
				f.setAccessible(true);//access private fields, breaks encapsulation
				
				if (Modifier.isStatic(f.getModifiers())) {
					
					try {
						b.append(f.getName());
						b.append("e");
						b.append(f.get(this));
					} catch (IllegalAccessException e) {
						
					}
				}
			}
		
			b.append(" ] ");
			return b.toString();

	}

}
