package JavaTutorial;

public class This_KeywordExample {

    int a = 2;

    public void get_data() {

        int a = 3;
        int sum;

        System.out.println(a);
        System.out.println("In this sceneria because we are calling get_data method it will return a value as 3");
        //if we need to get global value into this method printed than we use a keyword called this.
        //this referes to current object object scope lies in class level;

// To print the global variable we have to use the keyword "this"
        System.out.println(this.a);

//Interview Question how can you print the Sum of local variable a & Global variable a;

        System.out.println(sum = this.a + a);


    }


    public static void main(String[] args) {

        This_KeywordExample fk = new This_KeywordExample();
        fk.get_data();





    }

}
