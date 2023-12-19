package mycom.dept.tgeneric;

import java.util.ArrayList;

public class MyList<T> {
	ArrayList<T> arr = new ArrayList<T>();
	
	// 형 변환을 자주 사용해야하는데 피곤함을 느낌
	// <> 꺽쇠가 제네릭을 의미함. 아직 형식을 정하지않음, 타입 미지정
	// 어떤 타입의 데이터가 들어올지는 모르겠지만 실행할 때 그 타입에 맞게 실행하겠다는 의미
	public void add (T obj) {
		arr.add(obj);
	}
	
	public T get(int index) {
		return arr.get(index);
	}
}
