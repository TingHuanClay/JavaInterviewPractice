Lambda 語法結構
input -> body

#### input

##### 1. 不輸入

    ()

##### 2. 單個輸入

    x

##### 3. 多個輸入 (不省略型態)

    (int x, int y)

##### 4. 多個輸入 (省略型態)

    (x, y)

#### body

##### 1. 什麼都不做

    {}

##### 2. 單行不回傳值

    System.out.println("No");

##### 3. 多行不回傳值

    {
    	System.out.println("No");
    	System.out.println("No_2");
    }

##### 4. 單行回傳值

    x+y

##### 5. 多行回傳值

    {
    	x++;
    	y-=x;
    	return x+y;
    }
