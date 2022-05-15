package thiskeyword;


	
	
	class Student{  
		int rollno;  
		String name;  
		float fee;
		
		Student(int rollno,String name){  
		this.rollno=rollno; //this refers to current  class instance variable(this access the current class variables)
		this.name=name;  
		
		}
		
		Student(int rollno,String name,float fee){  
			this(rollno, name);//calls the paremeterized constructor(this access the constructor);
			this.fee=fee;
			
			}
		void message(){System.out.println(rollno+" "+name+" "+fee);} 
		
		void display(){
			this.message(); // or message() //this refers to current class instance variable(this access the current method)
			message();
		}
		}  
	public class This {
		public static void main(String args[]){  
		Student s1=new Student(111,"ankit",5000f);  
		Student s2=new Student(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		}}  


