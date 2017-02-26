package by.epam.course.basic.main;

/**
 * @author Kiryl_Miatlitski
 * 
 * date: 26 February 2017
 * 
 *  Task: ������� ������������ ������������. ����������� ����������, ����������� ��������� �������� 
 *  ������������ (������, �������������� ����� �������). ������������� �������� �������� ������������ 
 *  ������������(�����, ����� � �.�.) � ����� ��������(������, ����� � �.�.). ���������� ����������� 
 *  �����������, ���� �� ���������� ������������ � ��������.
 */
public class Task1 {

	public static void main(String[] args) {
		
		Literature�ollection collection1 = new Literature�ollection("������");
		Literature�ollection collection2 = new Literature�ollection("�����");
		
		// collection 1
		collection1.addWork(new Poem("������ � �������", "1820", "������ �.�.", "��������� �����"));
		collection1.addWork(new Poem("��� �����", "1829", "������ ���������", "������������� �����"));
		collection1.addWork(new Story("������ � ���������", "1940", "������ ����������� ��������", 32));

	    // collection 2
		collection2.addWork(new Story("���� ��������", "1877", "��� �������", 249));
		collection2.addWork(new Novel("�����������", "1862", "������ ����.", "�����"));
		collection2.addWork(new Novel("����� �����", "1897", "������� �����.", "���������������"));
		
		LiteratureWork testWork=new Story("���� ��������", "1877", "��� �������", 249);
		if (collection1.existInCollection(testWork)){
			System.out.println(collection1.getType()+ " �������� "+testWork.show());
		} else {
			System.out.println(collection1.getType()+ " �� �������� "+testWork.show());
		}
		
		if (collection2.existInCollection(testWork)){
			System.out.println(collection2.getType()+ " �������� "+testWork.show());
		} else {
			System.out.println(collection2.getType()+ " �� �������� "+testWork.show());
		}
		
		System.out.println();
		LiteratureWork testWork1=new Story("���� ��������", "1878", "��� �������", 250);
		if (collection1.existInCollection(testWork1)){
			System.out.println(collection1.getType()+ " �������� "+testWork1.show());
		} else {
			System.out.println(collection1.getType()+ " �� �������� "+testWork1.show());
		}
		
		if (collection2.existInCollection(testWork1)){
			System.out.println(collection2.getType()+ " �������� "+testWork1.show());
		} else {
			System.out.println(collection2.getType()+ " �� �������� "+testWork1.show());
		}
	}

}
