class Cal{
public static void main(String[]args){
Calculator tanya=new Calculator();
tanya.add();
System.out.println(tanya.add());
tanya.add(4.5f,3.2f);
System.out.println(tanya.add(4.5f,3.2f));
tanya.add(5,4,2);
System.out.println(tanya.add(5,4,2));
tanya.add(5l,2l);
System.out.println(tanya.add(5l,2l));
}
}

