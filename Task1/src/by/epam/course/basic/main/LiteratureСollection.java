package by.epam.course.basic.main;

public class Literature—ollection {
	
	private int collectionSize = 0;
	private LiteratureWork[] collection;
	private String type;
	
	public Literature—ollection(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}

	public int getCollectionSize() {
		return collectionSize;
	}
	
	public void addWork(LiteratureWork work){
		if (this.collectionSize == 0){
			collectionSize++;
			collection = new LiteratureWork[collectionSize];
			collection[0] = work;
		} else {
			collectionSize++;
			LiteratureWork[] temp = new LiteratureWork[collectionSize];
			for (int i = 0; i < collection.length; i++){
				temp[i]=collection[i];
			}
			temp[collectionSize-1]=work;
			collection=temp;
		}		
	}
	
	public boolean existInCollection(LiteratureWork work){
		for (int i = 0; i < collectionSize; i++){
			if (collection[i].equals(work)){
				return true;
			}
		}
		return false;
	}
	

}
