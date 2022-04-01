package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		//Thông tin một sinh viên
		System.out.println("Nhap thong tin sinh vien");
		
		System.out.println("nhap ten sinh vien");
		String student_name = sc.nextLine();
		System.out.println(student_name);
		
		System.out.println("nhap ma SV");
		String student_code = sc.nextLine();
		System.out.println(student_code);
		
		System.out.println("nhap CCCD");
		String student_Id = sc.nextLine();
		System.out.println(student_Id);
		
		System.out.println("nhap ten truong");
		String school = sc.nextLine();
		System.out.println(school);
		
		System.out.println("nhap lop");
		String stdent_class = sc.nextLine();
		System.out.println(stdent_class);
		
		System.out.println("nhap diem trung binh");
		double arg_scores = sc.nextDouble();
		sc.nextLine();
		System.out.println(arg_scores);
		
		
		//thông tin công nhân
		System.out.println("thong tin cong nhan");
		
		System.out.println("nhap ten cong nhan");
		String worker_name = sc.nextLine();
		System.out.println(worker_name);
		
		System.out.println("nhap dia chi");
		String worker_add = sc.nextLine();
		System.out.println(worker_add);
		
		System.out.println("nhap so dth");
		String worker_phone_num = sc.nextLine();
		System.out.println(worker_phone_num);
		
		System.out.println("nhap he so luong");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println(salary);
		
		
		//thông tin một chiếc xe
		System.out.println("thong tin xe");
		
		System.out.println("nhap ten xe");
		String car_name = sc.nextLine();
		System.out.println(car_name);
		
		System.out.println("nhap hang");
		String car_company = sc.nextLine();
		System.out.println(car_company);
		
		System.out.println("nhap gia xe");
		String car_price = sc.nextLine();
		System.out.println(car_price);
		
		System.out.println("nhap mau xe");
		String car_color = sc.nextLine();
		System.out.println(car_color);
		
		String name = "bao";
		int old = 12;
		double mark = 7.8;
		System.out.format("- Name: %s  - Old: %d  - mark: %.1f " , name , old , mark);
	}

}
