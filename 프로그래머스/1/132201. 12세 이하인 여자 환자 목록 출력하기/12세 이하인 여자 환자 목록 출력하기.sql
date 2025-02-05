-- 코드를 입력하세요
SELECT PT_NAME,	PT_NO,	GEND_CD, AGE,	ifnull(TLNO,"NONE") as TLNO
    from patient
    where GEND_CD = "W" and age < 13
    order by age desc,PT_name;