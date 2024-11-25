class Cat
{
    void says(){
        System.out.println("Meow!");
    }
}

class PetCat extends Cat
{	
	// type of a cat
    void says()
	{
        System.out.println("Meow Meow!!");
    }
}

class MagicCat extends Cat
{
	//another type of a cat
    boolean noOne;
    void says(){
        
		if(noOne){ //if nOne = true then it execute
            super.says();//use super class definition
        }else{
            System.out.println("Hi there!!");
        }
    }
}

class multiplein
{
    public static void main(String[] args) 
	{
        PetCat c1= new PetCat();
        MagicCat c2=new MagicCat();

		c2.noOne=true;
        c2.says();
        c1.says();
        c2.noOne=false;
        c2.says();

    }
}