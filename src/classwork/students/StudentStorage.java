package classwork.students;


public class StudentStorage {

    private Student[] array = new Student[10];
    private int size = 0;


    public void add(Student student) {
        if (array.length == size) {
            extend();
        }
        array[size++] = student;
    }

    private void extend() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }


    public void delete(int index) {
        if (haveStudentInThisIndex(index)) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            array[--size] = null;
            System.out.println("Student deleted");

        } else {
            System.out.println(" Error not correct index");
        }
    }

    public void printStudentsByLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }
public boolean haveStudentInThisIndex(int index){
    if (index >= 0 && index < size){
         return true;
    }
       else {
        return false;
    }
}
    public void changeStudentLessonInIndex(int index, String newLessonName) {
        array[index].setLesson(newLessonName);
    }
}



