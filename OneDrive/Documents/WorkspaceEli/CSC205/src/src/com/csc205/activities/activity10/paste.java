package src.com.csc205.activities.activity10;

public class paste {

	
	 int pos = 0;
     int[] a;
     
	while (pos < a.length) {
  	   if (pos == 0 || a[pos] >= a[pos - 1]) {
  		   pos = pos + 1;
  	   }else {
  		   swap(a[pos], a[pos - 1]);
  		   pos = pos - 1;
      	}
      }

  }
}



private static<T extends Comparable<T>> void swap(T[] data, int pos, int a[]) {

    T temp = data[pos];
    data[pos] = data[a[pos - 1]];
    data[a[pos - 1]] = temp;

}

int[] pos = null;

for (int index = 1; index < pos.length;) {
	  if (pos[index - 1] <= pos[index] ) {
		  ++index;
	  }else {
		  int tempVal = pos[index];
		  pos[index] = pos[index - 1];
		  pos[index - 1] = tempVal;
		  --index;
		  if (index == 0) {
			  index = 1;
		  }
	  }
	  }
}

