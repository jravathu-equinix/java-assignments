public class Game
{
    static int  findNext(String[] contestants ,int ind,int len)
    {
        while(contestants[ind]=="")
        {
            ind=(ind+1)%len;
        }
        return ind;
    }

    static int getWinnerIndex(String[] contestants, int[] songStopsInSec)
    {
        int count_of_contestants = contestants.length;
        int location = 0;
        int time_index = 0;

        while(count_of_contestants != 1)
        {
            int timestamp = songStopsInSec[time_index];
            for(int i=1;i<=timestamp;i++)
            {
                location=Game.findNext(contestants,(location+1)%contestants.length,contestants.length);
            }

            contestants[location%contestants.length] = "";
            location=Game.findNext(contestants,location,contestants.length);
            count_of_contestants--;
            time_index=(time_index+1)%songStopsInSec.length;
        }

        int winner_index = -1;
        for(int i=0;i<contestants.length;i++)
        {
            if(contestants[i] != "")
                winner_index = i;
        }
        return winner_index;
    }
    public static void main(String []args)
    {
        String[] contestants = {"a", "b", "c", "d","e"};
        int[] songStopsInSec = {3,1,1};

        int winner_index = getWinnerIndex(contestants, songStopsInSec);
        System.out.println("winner index: " + winner_index);
        System.out.println("winner: "+ contestants[winner_index]);
    }
}