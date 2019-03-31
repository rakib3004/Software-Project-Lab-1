#include <stdio.h>

int main ()
{
    int key;
    int loop;
    int search;
    int index;
    int flag=0;
    int count=0;
    int array[10]= {1101,1102,1103,1104,1105,1106,1107,1108,1109,1110};
    printf("enter your key\n");
    printf("press 1 for print\n");
    printf("press 2 for search\n");
    printf("press 3 for value showing\n");
    scanf("%d",&key);

    if(key==1)
    {

        for(loop=0; loop<10; loop++)
        {
            printf("the %d nd value is:%d\n",loop,array[loop]);

        }

    }
    else if(key==2)
    {
        printf("the search value:");
        scanf("%d",&search);


        for(loop=0; loop<10; loop++)
        {
            if(search==array[loop])

            {
                flag++;
            }

        }


        if(flag==1)
        {

            printf("the number is found");
        }

        else
        {

            printf("the number is not found");
        }
    }

    else if(key==3)

    {
        printf("input your array index number:");
        scanf("%d",&index);


        printf("array[%d] is equal to %d",index,array[index]);


    }

    else
    {
        printf("you press wrong key");
    }


    return 0;
}

