

int maxProfit(int* prices, int pricesSize){
    int getmin = prices[0];
    int getmax = 0;
    for(int i=0;i<pricesSize;i++)
    {
        if(getmin>prices[i])
        {
            getmin = prices[i];
        }
        if(getmax < prices[i]-getmin)
        {
            getmax = prices[i]-getmin; 
        }
        
    }
    
return getmax;
}