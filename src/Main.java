class Main {
	public static void main(String[] args) {
		int i = 로봇.get정수();
		boolean b = 로봇.get논리();
		사람 a사람 = 로봇.get사람();
		사람 a사람2 = 로봇.get사람2();
		사람 a사람3 = 로봇.get사람3();
		사람 a사람4 = 로봇.get사람4();
		사람 a사람5 = 로봇.get사람5(123, false);
		로봇.get사람6(123, false);
	}
}
class 사람{
	//설계도에게 일을 시키는 방식
}
class 로봇{
	//설계도에게 일을 시키는 방식
	static int get정수() {
	//static의 이유는 설계도에게 일을 시키는 방식이이때문이다 동적 멤버라고도 불린다
	//get정수의 타입이 int인 이유는 Main클래스에서 int타입으로 넣어지기때문이다
		return 0;
	//정수의 초기값은 0이기때문이다
	}

	static boolean get논리() {
	//Main클래스에서 get논리가 boolean타입에 넣어지기때문이다
		return false;
	//boolean의 기본값은 true와false이다
	}

	static void get사람6(int i, boolean b) {
	//void는 리턴타입없은 리턴안하겠다는 의미이다
	//Main클래스의 로봇.get사람5(123, false)에서 인자값에 맞는 타입을 넣어준다
	}

	static 사람 get사람5(int i, boolean b) {
	//Main클래스의 로봇.get사람6(123, false);에서 인자값에 맞는 타입을 넣어준다
		return null;
	//자바에서 사람의 기본타입을 null로 잡아주었기때문이다
	}

	static 사람 get사람4() {
		return null;
	}

	static 사람 get사람3() {
		return null;
	}

	static 사람 get사람2() {
		return null;
	}

	static 사람 get사람() {
		return null;
	}
	
}