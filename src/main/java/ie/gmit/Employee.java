package ie.gmit;

public class Employee {

    private String title;
    private String name;
    private String ppsNumber;
    private String phone;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String ppsNumber, String phone, String employmentType, int age)
    {
        setTitle(title);
        setName(name);
        setPpsNumber(ppsNumber);
        setPhone(phone);
        setEmploymentType(employmentType);
        setAge(age);
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        if((title.equalsIgnoreCase("mr") || (title.equalsIgnoreCase("mrs") || (title.equalsIgnoreCase("ms")))))
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Title");
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name.length() >= 5 && name.length() <= 22)
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public String getPpsNumber()
    {
        return ppsNumber;
    }

    public void setPpsNumber(String ppsNumber)
    {
        if(ppsNumber.length() == 6 )
        {
            this.ppsNumber = ppsNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid PPS Number");
        }
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        if(phone.length() == 7 )
        {
            this.phone = phone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }

    public String getEmploymentType()
    {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if((employmentType.equalsIgnoreCase("full-time") || (employmentType.equalsIgnoreCase("part-time"))))
        {
            this.employmentType = employmentType;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Employment Type");
        }
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age >= 18 )
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Age");
        }
    }
}
