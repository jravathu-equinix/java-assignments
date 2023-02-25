package student;

public class Addition {
    public float addition(float[] marks, float total)
    {
        for(int i=0;i<marks.length;i++)
            total += marks[i];

        return total;
    }
}
