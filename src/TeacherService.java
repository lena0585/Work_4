import java.util.List;
// Принцип инверсии зависимостей
public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String surname, String firstname, String midllename) {
        Teacher teacher = new Teacher(++maxTeacherId,surname,firstname,midllename);
        teacherList.add(teacher);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String midllename){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSurname(surname);
                teacher.setFirstname(firstname);
                teacher.setMidllename(midllename);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}
