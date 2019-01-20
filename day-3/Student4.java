//initializing throuhg method
class Student
{
int roll;
String name;

void display()
{
System.out.println(roll+" "+name);
}

void insert(int r,String n)
{
roll=r;
name=n;
}
}
class Student4{
public static void main(String args[]){
	
	Student s1=new Student();
	Student s2=new Student();
	s1.insert(46,"rajat");
	s2.insert(90,"shubham");
	s1.display();
	s2.display();
}
}
