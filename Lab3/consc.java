
    class Student{

        int id ;
        String name;
        Student(int i, String n){
            id=1;
            name=n;
        }
        void display(){
            System.out.println(id+ " "+ name);
        }
        public static void main(String args[]){
            Student s1= new Student(1, "Ankit");
            Student s2= new Student(2, "Luffy");
            s1.display();
            s2.display();

        }
        
    }
