package com.fitz.abus.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @ProjectName: ABus
 * @Package: com.fitz.abus.bean
 * @ClassName: BusBaseSHBean
 * @Author: Fitz
 * @CreateDate: 2018/12/23 17:34
 *         GSON数据类，不要改动
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class BusBaseSHBean implements Parcelable {

    public static final Creator<BusBaseSHBean> CREATOR = new Creator<BusBaseSHBean>() {
        @Override
        public BusBaseSHBean createFromParcel(Parcel in) {
            return new BusBaseSHBean(in);
        }

        @Override
        public BusBaseSHBean[] newArray(int size) {
            return new BusBaseSHBean[size];
        }
    };
    private String start_latetime;
    private String line_name;
    private String end_earlytime;
    private String start_earlytime;
    private String end_stop;
    private String line_id;
    private String start_stop;
    private String end_latetime;


    public BusBaseSHBean() {

    }

    protected BusBaseSHBean(Parcel in) {
        start_latetime = in.readString();
        line_name = in.readString();
        end_earlytime = in.readString();
        start_earlytime = in.readString();
        end_stop = in.readString();
        line_id = in.readString();
        start_stop = in.readString();
        end_latetime = in.readString();
    }

    @Override
    public String toString() {
        return "\n" +line_name + "\n" + line_id + "\n" + start_earlytime + "\n" + start_latetime + "\n" + end_earlytime + "\n" + end_latetime + "\n" +
                start_stop + "\n" + end_stop;
    }

    public String getStartLatetime() {
        return start_latetime;
    }

    public void setStartLatetime(String start_latetime) {
        this.start_latetime = start_latetime;
    }

    public String getLine_name() {
        return line_name;
    }

    public void setLine_name(String line_name) {
        this.line_name = line_name;
    }

    public String getEndEarlytime() {
        return end_earlytime;
    }

    public void setEndEarlytime(String end_earlytime) {
        this.end_earlytime = end_earlytime;
    }

    public String getStartEarlytime() {
        return start_earlytime;
    }

    public void setStartEarlytime(String start_earlytime) {
        this.start_earlytime = start_earlytime;
    }

    public String getEnd_stop() {
        return end_stop;
    }

    public void setEnd_stop(String end_stop) {
        this.end_stop = end_stop;
    }

    public String getLineId() {
        return line_id;
    }

    public void setLineId(String line_id) {
        this.line_id = line_id;
    }

    public String getStartStop() {
        return start_stop;
    }

    public void setStartStop(String start_stop) {
        this.start_stop = start_stop;
    }

    public String getEndLatetime() {
        return end_latetime;
    }

    public void setEndLatetime(String end_latetime) {
        this.end_latetime = end_latetime;
    }

    public boolean nonNull() {
        return getLine_name() != null && getEnd_stop() != null;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(start_latetime);
        parcel.writeString(line_name);
        parcel.writeString(end_earlytime);
        parcel.writeString(start_earlytime);
        parcel.writeString(end_stop);
        parcel.writeString(line_id);
        parcel.writeString(start_stop);
        parcel.writeString(end_latetime);
    }
}