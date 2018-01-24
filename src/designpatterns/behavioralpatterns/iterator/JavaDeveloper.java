package designpatterns.behavioralpatterns.iterator;

public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skils) {
        this.name = name;
        this.skills = skils;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String[] getSkils() {return skills;}
    public void setSkils(String[] skils) {this.skills = skils;}

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            return index<skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
