package com.amikth.ch2;

public class CharToCode {
	public static void main(String[] args) {
		
		char ch = 'A';		// char ch = 65;
		int code = (int)ch;	// ch�� ����� ���� int Ÿ������ ��ȯ�Ͽ� �����Ѵ�.
		
		System.out.printf("%c=%d(%#X) %n", ch, code, code);

		char hch = '��';		// char hch = 0XAC00;
		
		System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch);
		
	}
}
