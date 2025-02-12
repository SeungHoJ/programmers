-- 코드를 입력하세요
SELECT date_format(SALES_DATE,"%Y-%m-%d") as SALES_DATE,	PRODUCT_ID,	USER_ID, SALES_AMOUNT
    from ONLINE_SALE
    where substr(SALES_DATE,1,7) = "2022-03"
union
SELECT date_format(SALES_DATE,"%Y-%m-%d") as SALES_DATE,	PRODUCT_ID,	Null as USER_ID, SALES_AMOUNT
    from OFFLINE_SALE 
    where substr(SALES_DATE,1,7) = "2022-03"
order by SALES_DATE, PRODUCT_ID, USER_ID