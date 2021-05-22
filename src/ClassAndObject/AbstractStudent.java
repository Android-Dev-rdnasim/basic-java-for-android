package ClassAndObject;

class AbstractStudent extends Abstract{

    public int graduationYear = 2021;

    @Override
    public void study() {
        System.out.println("Study day long all about Android!");
    }

    public static void main(String[] args){
        AbstractStudent myStudent = new AbstractStudent();

        System.out.println(myStudent.graduationYear);
        System.out.println(myStudent.fName);
        System.out.println(myStudent.age);
        myStudent.study();
    }
}
