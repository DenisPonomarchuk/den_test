/*
Part1
�������� �����, ������� ��������� ���������������� ������ � ������� ������ "Hello, World". 
�������� ��������� ���� (bat ���� Windows ��� shell ������ Linux), ������� ����������� � 
��������� ������ ���������� �� �������. ��������� ���� ��������� � �������� src Eclipse-�������.
*/

public class HW1_task1 {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}

//HW1_task1(1).bat:
/*
del *.class
javac.exe HW1_task1.java
rem or full path
cls
java.exe HW1_task1
rem or full path
pause
*/

//OR

/*HW1_task1(2).bat 
//from command line: HW1_task1.bat HW1_task1.java 
del *.class
javac.exe %1
cls
java.exe "%~n1"
pause
*/