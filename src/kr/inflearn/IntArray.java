package kr.inflearn;

public class IntArray {
	// 갯수를 저장할 카운트 
	private int count;
	// 여러개의 데이터를 저장할 배열 
	private int[] arr;
	// 생성자 메서드를 통해 몇개의 원소를 만들건지
	public IntArray() {
		this(10);	// 디폴트로 10사이즈 
	}
	// 초기값을 받아서 배열을 만들거 
	public IntArray(int init) {
		arr = new int[init];
	}
	// 집어넣는 동작 
	public void add(int data) {
		arr[count++] = data;	// 후위니까 0번쨰 들어가고(count의 초기값0) ++한다 
	}
	// 밖으로 데이터를 리턴 
	public int get(int index) {
		return arr[index];
	}
	// 배열의 크기정보를 리턴 
	public int size() {
		return count;
	}
}
