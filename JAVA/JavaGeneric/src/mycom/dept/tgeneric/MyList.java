package mycom.dept.tgeneric;

import java.util.ArrayList;

public class MyList<T> {
	ArrayList<T> arr = new ArrayList<T>();
	
	// �� ��ȯ�� ���� ����ؾ��ϴµ� �ǰ����� ����
	// <> ���谡 ���׸��� �ǹ���. ���� ������ ����������, Ÿ�� ������
	// � Ÿ���� �����Ͱ� �������� �𸣰����� ������ �� �� Ÿ�Կ� �°� �����ϰڴٴ� �ǹ�
	public void add (T obj) {
		arr.add(obj);
	}
	
	public T get(int index) {
		return arr.get(index);
	}
}
