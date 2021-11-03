public class InstanceOfDemo {
    public static void main(String[] args) {
        // 引用 People 类的实例
        PeopleII obj = new PeopleII();
        if(obj instanceof Object){
            System.out.println("我是一个对象");
        }
        if(obj instanceof PeopleII){
            System.out.println("我是人类");
        }
        if(obj instanceof TeacherII){
            System.out.println("我是一名教师");
        }
        if(obj instanceof President){
            System.out.println("我是校长");
        }
        System.out.println("-----------");  // 分界线

        // 引用 Teacher 类的实例
        obj = new TeacherII();
        if(obj instanceof Object){
            System.out.println("我是一个对象");
        }
        if(obj instanceof PeopleII){
            System.out.println("我是人类");
        }
        if(obj instanceof TeacherII){
            System.out.println("我是一名教师");
        }
        if(obj instanceof President){
            System.out.println("我是校长");
        }
    }
}
class PeopleII { }
class TeacherII extends PeopleII { }
class President extends TeacherII { }
