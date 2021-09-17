package in.koshurtech.zstmx.database.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "drmInformation")
public class drmInformation {
    public drmInformation(String id, String propertyName, String propertyBody){
        this.propertyName = propertyName;
        this.propertyBody = propertyBody;
        this.id = id;
    }
    @NonNull
    @PrimaryKey
    public String id;
    @NonNull
    @ColumnInfo(name = "propertyName")
    public String propertyName;
    @NonNull
    @ColumnInfo(name = "propertyBody")
    public String propertyBody;
}