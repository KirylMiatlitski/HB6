package by.epam.course.basic.main;

public class LiteratureWork {
	private String name;
	private String year;
	private String authorName;
	
	public LiteratureWork(String name, String year, String authorName) {
		super();
		this.name = name;
		this.year = year;
		this.authorName = authorName;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return year;
	}

	public String getAuthorName() {
		return authorName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LiteratureWork other = (LiteratureWork) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
	public String show(){// к этому заданию уже было объяснено о раздалении кода, который работает с данными, и кода, который что-то выводит-вводит
		// наличие таких методов в классах, объекты которых хранят данные, является грубой ошибкой
		return "Ëèòðåàòóðíîå ïðîèçâåäåíèå "+this.name+" ("+this.year+")";
	}
	
}
