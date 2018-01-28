package com.ody.p2p.search.searchkey;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by admin on 2016/2/19.
 */
@DatabaseTable(tableName = "tb_search")
public class SearchRiCiBean {

    /*设置成主键*/
    @DatabaseField(columnName = "_id", generatedId = true)
    private int searchId;

    @DatabaseField(columnName = "riCiName")
    private String riCiName;

    public SearchRiCiBean() {
    }

    public SearchRiCiBean(String riCiName) {
        this.riCiName = riCiName;
    }

    public int getSearchId() {
        return searchId;
    }

    public void setSearchId(int searchId) {
        this.searchId = searchId;
    }

    public String getRiCiName() {
        return riCiName;
    }

    public void setRiCiName(String riCiName) {
        this.riCiName = riCiName;
    }

    @Override
    public String toString() {
        return riCiName.substring(0,riCiName.length()-2);
    }
}
