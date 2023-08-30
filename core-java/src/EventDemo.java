class OuterEventImpl implements Event{
	public void doSomething() {
		System.out.println("Outer Event Implementation");
	}
}

public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("Simple Event implementation");

	}
	
	private class InnerEventImpl implements Event{
		@Override
		public void doSomething() {
			System.out.println("Inner Event Implementation");
			
		}
	}
	
	public static class StaticEventImpl implements Event{
		@Override
		public void doSomething() {
			System.out.println("Static Event Implementation");
			
		}
	}
	
	public void oneMoreEvent() {
		class NestedEventImpl implements Event{
			@Override
			public void doSomething() {
				System.out.println("Nested Event Implementation");
				
			}
		} //Even if we give a ; for indicating end of class declarartion, it would still work fine
		
		new NestedEventImpl().doSomething();
	}
	
	public void oneLastEvent() {
		Event e=new Event() {
			@Override
			public void doSomething() {
				System.out.println("Anonymous Event Implementation");
				
			}
		}; //Anonymous classes which don;t have any name of theirs and would either be have to  called through....
		e.doSomething(); //or, another way to do this same thing is without declaring Event object e and doing the method mentioned in pg 10 of my note book

	}
	
	public void pakkaLastEvent() {
		Event e=() -> System.out.println("Lambda Event Implementation"); //This is the lambda event implementation, wherein using only the arrow form and no requirement of the body definition
		e.doSomething();
	}
	
	
	
	public static void main(String[] args) {
		EventDemo ed=new EventDemo();
		ed.doSomething();
		
		OuterEventImpl oe=new OuterEventImpl();
		oe.doSomething();
		
		InnerEventImpl ie=ed.new InnerEventImpl();
		ie.doSomething();
		
		EventDemo.StaticEventImpl se=new EventDemo.StaticEventImpl(); // Even if we write only StaticEventImpl se also it'd work fine
		se.doSomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();// Since we were not able to do something like Event e and then doSomething(). we did this as a repair
		ed.pakkaLastEvent();
		
		
		
		
		
	}

}
