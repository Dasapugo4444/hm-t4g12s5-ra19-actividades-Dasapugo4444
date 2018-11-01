package co.edu.sena.programming.les05.NestedClasses.src.com.example;

public class OuterClass { //1 nivel superior

    //some types of nested class 
    public int x = 42;

    public void method1() {
        // local classes are inner classes but not members of the outer class
        class LocalClass { //clase interna local

            public void localPrint() {
                System.out.println("In local class");
                System.out.println(x);
            }
        }
        LocalClass lc = new LocalClass();
        lc.localPrint();
    }

    public void method2() {
        Runnable r = new Runnable() { //clase interna local anónima

            @Override
            public void run() {
                System.out.println("In an anonymous local class method");
                System.out.println(x);
            }
        };
        r.run();
    }
    public Runnable r = new Runnable() {

        @Override
        public void run() {
            System.out.println("In an anonymous class method");
            System.out.println(x);
        }
    };
    Object o = new Object() {

        @Override
        public String toString() {
            return "In an anonymous class method";
        }
    }; //Clase interna anónima

    public class InnerClass { //Clase interna de miembro

        // hides OuterClass x
        public int x = 43;
        //static requires final
        public static final int y = 44;

        public void innerPrint() {
            System.out.println("In a inner class method");
            System.out.println(x);
        }
    }

    // not an inner class because it is static
    public static class StaticNestedClass { //clase anidada estática

        public void staticNestedPrint() {
            System.out.println("In a static nested class method");
            //compile error
            //System.out.println(x);
        }
    }

    // nesting...
    public class A { //clase interna de miembro

        public class B { //clase interna de miembro

            public void method() {
                class C { //clase interna local
                }
            }
        }
    }
}