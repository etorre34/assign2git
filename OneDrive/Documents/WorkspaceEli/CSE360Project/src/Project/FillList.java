package Project;


import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.geometry.Insets;

@SuppressWarnings("restriction")
public class FillList{
	
	//arraylist of list objects
	List<ListItem> listItemArray;
	
	public FillList (ListItemArray arrayList){
		listItemArray = arrayList.listItemArray;
	}
	
	public void createListGUI(){
		BorderPane listLayout = new BorderPane();
		HBox listTop = listTop();
		VBox listCenter = center();
		
		Main.list = new Scene(listLayout, 1200, 800);  
		
		listLayout.setTop(listTop);
		listLayout.setCenter(listCenter);
	}
	
	public VBox center (){
		//center list
		VBox centerListLayout = listContainer();
		
		return centerListLayout;
	}
	
	
	public VBox listContainer() {
	    VBox listContainer = new VBox();
	    listContainer.setPadding(new Insets(10));
	    listContainer.setSpacing(8);
	    listContainer.getChildren().add(listDescriptors());
	    for(int i = 0; i < listItemArray.size(); i++){
		    listContainer.getChildren().add(listItem(i));
	    }

	    return listContainer;
	}
	
	public HBox listItem(int arrayPosition) {
		Label priorityNumberLabel, dueDateLabel, titleLabel, statusLabel;

	    HBox listItem = new HBox();
	    listItem.setPadding(new Insets(15, 12, 15, 12));
	    listItem.setSpacing(200);
	    listItem.setStyle("-fx-background-color: #FFFFFF;");
	    
		priorityNumberLabel = new Label();
		priorityNumberLabel.setText("# " + String.valueOf(listItemArray.get(arrayPosition).getPriorityNumber()));
		priorityNumberLabel.setPrefSize(100, 20);
		priorityNumberLabel.setId("priorityNumberLabel");
		
		dueDateLabel = new Label();
		dueDateLabel.setText(
				String.valueOf(listItemArray.get(arrayPosition).getDueMonth()) 
				+ " / " 
				+ String.valueOf(listItemArray.get(arrayPosition).getDueDay())
				);
		dueDateLabel.setPrefSize(100, 20);
		
		titleLabel = new Label();
		titleLabel.setText(listItemArray.get(arrayPosition).getTitle());
		titleLabel.setPrefSize(100, 20);
		
		statusLabel = new Label();
		if (listItemArray.get(arrayPosition).getStatus().equals("Not Started")){
			statusLabel.setText(listItemArray.get(arrayPosition).getStatus());
		} else {
			statusLabel.setText(
					listItemArray.get(arrayPosition).getStatus()
					+ " "
					+ String.valueOf(listItemArray.get(arrayPosition).getStatusMonth())
					+ " / "
					+ String.valueOf(listItemArray.get(arrayPosition).getStatusDay())
					);
		}
		statusLabel.setPrefSize(200, 20);
		
		listItem.getChildren().addAll(priorityNumberLabel,dueDateLabel, titleLabel, statusLabel);

		listItem.setOnMouseClicked(e -> {
			int priorityNumber;
			int priorityNumberLabelIndex = listItem.lookup("#priorityNumberLabel").toString().indexOf('\'');
			priorityNumber = Integer.parseInt(listItem.lookup("#priorityNumberLabel").toString().substring(priorityNumberLabelIndex+3,priorityNumberLabelIndex+4));		

			//editNote scene
			EditNote editNoteScene = new EditNote(Main.arrayList, priorityNumber-1);
			editNoteScene.createEditNoteGUI();
			
			Main.window.setScene(Main.editNote);
		});
	    return listItem;
	}
	
	public HBox listDescriptors (){
		Label priorityNumberLabel, dueDateLabel, titleLabel, statusLabel;
		
		HBox listItemDescriptor = new HBox();
		listItemDescriptor.setPadding(new Insets(15, 12, 15, 12));
		listItemDescriptor.setSpacing(300);
		listItemDescriptor.setStyle("-fx-background-color: #D7D7D7;");
		
		priorityNumberLabel = new Label("Priority #");
		dueDateLabel = new Label("Due Date");
		titleLabel = new Label("Title");
		statusLabel = new Label("Status");

		
		listItemDescriptor.getChildren().addAll(priorityNumberLabel,dueDateLabel, titleLabel, statusLabel);
		
		return listItemDescriptor;

	}
	
	//buttons for list
	Button addNote, report, load, save, sort;
	//regions for spacing header
	Region regionLeft, regionRight;
	//header text
	Label header;
	
	public HBox listTop() {
	    HBox listTop = new HBox();
	    listTop.setPadding(new Insets(15, 12, 15, 12));
	    listTop.setSpacing(10);
	    listTop.setStyle("-fx-background-color: #FFFFFF;");
	    
		//add note button
		addNote = new Button();
		addNote.setText("New Note");
	    addNote.setPrefSize(100, 20);
		addNote.setOnAction(e -> {
			Main.window.setScene(Main.newNote);
		});
		
		//report button
		report = new Button();
		report.setText("Report");
	    report.setPrefSize(100, 20);
		report.setOnAction(e -> {
			ListReport report = new ListReport(Main.arrayList);
			report.createReport();
			
		});
		
		regionLeft = new Region();
	    HBox.setHgrow(regionLeft, Priority.ALWAYS);
	    
	    header = new Label("To Do List");
	    header.setFont(new Font("Arial", 30));
	    
	    regionRight = new Region();
	    HBox.setHgrow(regionRight, Priority.ALWAYS);
		
		//load button
		load = new Button();
		load.setText("load");
		load.setPrefSize(100, 20);
		load.setOnAction(e -> {
			SaveList load = new SaveList();
			Main.arrayList = load.loadSave();
			FillList listScene = new FillList(Main.arrayList);
			listScene.createListGUI();
			Main.window.setScene(Main.list);
		});
		
		//save button
		save = new Button();
		save.setText("save");
		save.setPrefSize(100, 20);
		save.setOnAction(e -> {
			SaveList save = new SaveList();
			save.createSave();
		});
		
		//sort button
		sort = new Button();
		sort.setText("sort");
		sort.setPrefSize(100, 20);
		sort.setOnAction(e -> new SortList());
		
		listTop.getChildren().addAll(addNote,report, regionLeft, header, regionRight, load, save, sort);

	    return listTop;
	}
}
