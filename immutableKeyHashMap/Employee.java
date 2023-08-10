package immutableKeyHashMap;

public class Employee {
    public String name;
    public int age;

    public Employee(String na, int ag){
        this.name = na;
        this.age = ag;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String na){
        this.name = na;
    }

    public void setAge(int ag){
        this.age = ag;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass()) 
            return false;

        Employee other = (Employee) obj;
        if(age != other.age)
            return false;
        
        if(name == null){
            if(other.name != null){
                return false;
            }
        }else if(!name.equals(other.name)){
            return false;
        }

        return true;
    }

}