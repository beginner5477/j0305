package Practice1;

import java.util.Scanner;

//2차원 배열 연습 100명 이하의 학생이 입력됨
public class Demension_2_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언부
		String[] name = new String[100];
		int[][] sco = new int[100][4];
		double[] avg = new double[100];
		char[] gr = new char[100];
		int cnt = 0, tot = 0;
		int rtot = 0;
		String[] title = {"성명", "국어", "영어", "수학", "총점", "평균", "학점"};
		//자료 입력 + 계산처리하기
		for(int i = 0; i < name.length; i++)
		{
			System.out.print("학생이름을 입력하세요(종료-999입력):");
			name[i] = sc.next();
			if(name[i].equals("999")) break;
			for(int j = 0; j < 3; j++)
			{
				System.out.print(title[j + 1] + "점수를 입력하세요:");
				sco[i][j] = sc.nextInt();
				tot += sco[i][j];
			}
			sco[i][3] = tot;
			avg[i] = tot / 3.0;
			if(avg[i] >= 90) gr[i] = 'A';
			else if(avg[i] >= 80) gr[i] = 'B';
			else if(avg[i] >= 70) gr[i] = 'C';
			else if(avg[i] >= 60) gr[i] = 'D';
			else gr[i] = 'F';
			rtot += tot;
			tot = 0;
			cnt++;
		}
		//처리된 자료 출력부
		System.out.println("\n\t\t-----성적표-----");
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i = 0; i < cnt; i++)
		{
			System.out.print((i + 1)+"\t"+ name[i] + "\t");
			for(int j = 0; j < 4; j++)
			{
				System.out.print(sco[i][j] + "\t");
			}
			System.out.printf("%.2f\t%c\n",avg[i], gr[i]);
		}
		System.out.printf("\t\t총평균%.2f, 인원수%d명", (double)((rtot / 3.0) / cnt), cnt);
		sc.close();
	}
}
