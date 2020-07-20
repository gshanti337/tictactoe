/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictoktoc;

/**
 *
 * @author Shanti
 */
public class computerGame {
    int[][] box=new int[3][3];
    int totalRandomValue;
    int oneAvailableRandomValueGivenByAuto;
    int sum;
    public void initialValueOfBox()
    {
        for(int i=0;i <3 ;i++)
          for(int j=0;j < 3;j++)
              box[i][j]=2;
    }

    public int winningchance()
    {
        for(int i=0; i < 3;i++) // wining check for 0
                if(box[i][0] * box[i][1] * box[i][2] == 50)//each row winning chance only for row 
                {
                    if(box[i][0] == 2) return(i*3+0); //diff betwwen row is 3 so that i write here i*3+0
                    else if(box[i][1] == 2) return(i*3+1);
                    else return(i*3+2); 
                }
        
        for(int i=0 ; i < 3; i++)
            if(box[0][i] * box[1][i] * box[2][i] == 50) //each vertical check for winning
            {
                if(box[0][i]==2) return (i + 0); //diff between column is 1 so that i write i+0
                else if(box[1][i] == 2) return (i + 3);
                else return(i + 6); 
            }
        
        if(box[0][0] * box[1][1] * box[2][2] == 50 ) //diagonal check 
        {
            if(box[0][0] == 2) return 0;
            else if(box[1][1] == 2) return 4;
            else return 8;
        }
        
        if(box[0][2] * box[1][1] * box[2][1] == 50 ) // diagonal check bez two diagogal
        {
            if(box[0][2] == 2) return 2;
            else if(box[1][1] == 2) return 4;
            else return 6; 
        }
        
        for(int i=0; i < 3;i++) //wining check for x
                if(box[i][0] * box[i][1] * box[i][2] == 18)//each row winning chance only for row 
                {
                    if(box[i][0] == 2) return(i*3+0); //diff betwwen row is 3 so that i write here i*3+0
                    else if(box[i][1] == 2) return(i*3+1);
                    else return(i*3+2); 
                }
        for(int i=0 ; i < 3; i++)
            if(box[0][i] * box[1][i] * box[2][i] == 18) //each vertical check for winning
            {
                if(box[0][i]==2) return (i + 0); //diff between column is 1 so that i write i+0
                else if(box[1][i] == 2) return (i + 3);
                else return(i + 6); 
            }
        if(box[0][0] * box[1][1] * box[2][2] == 18 ) //diagonal check 
        {
            if(box[0][0] == 2) return (0);
            else if(box[1][1] == 2) return 4;
            else return 8;
        }
        if(box[0][2] * box[1][1] * box[2][0] == 18 ) // diagonal check bez two diagogal
        {
            if(box[0][2] == 2) return (2);
            else if(box[1][1] == 2) return 4;
            else return 6;
        }
        
        
        return -1;
    }
    public int randomClickByComputerOnBox() 
    {
        totalRandomValue=0;
        sum=0;
        for(int i=0;i <3 ;i++)
          for(int j=0;j < 3;j++)
              if(box[i][j]==2)
                  totalRandomValue++;
                  
        oneAvailableRandomValueGivenByAuto=(int)(Math.random() * totalRandomValue+1) ;
        for(int i=0;i <3 ;i++)
          for(int j=0;j < 3;j++)
          {
              if(box[i][j]==2)
                  sum++;
                if(sum == oneAvailableRandomValueGivenByAuto)
                {
                    if(i==0 && j==0) return 0; 
                    else if(i==0 && j==1) return 1; 
                    else if(i==0 && j==2) return 2; 
                    else if(i==1 && j==0) return 3;
                    else if(i==1 && j==1) return 4;
                    else if(i==1 && j==2) return 5; 
                    else if(i==2 && j==0) return 6;
                    else if(i==2 && j==1) return 7;
                    else if(i==2 && j==2) return 8;   
                }    
          }
          
        return -1;
  
    }
}
