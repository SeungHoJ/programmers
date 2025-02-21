-- 코드를 작성해주세요
select it.ITEM_ID,	ii.ITEM_NAME, ii.RARITY
    from ITEM_INFO ii
    join item_tree it
    on ii.item_id = it.item_id
    where it.parent_item_id in (select item_id from item_info where rarity = "RARE")
    order by it.item_id desc;
    
    