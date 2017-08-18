package com.msy.globalaccess.data.bean.ticket;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by WuDebin on 2017/3/21.
 */

public class TripScenicTicketBean implements Parcelable {

    private String scenicTicketTypeId;//票据ID
    private String ticketPriceName;//票据名称
    private String price;//单价
    private int amount;//预订数量
    private int ticketType;//0-成人1-儿童2-特殊
    private int tripScenicTicketItemId;//团队行程景点关联订票明细ID
    private int changeType;//变更的状态 0未变更 1删除 2新增 3修改
    private int isDate;//是否预约 0或者空 未预约 1已预约

    public TripScenicTicketBean() {

    }

    protected TripScenicTicketBean(Parcel in) {
        scenicTicketTypeId = in.readString();
        ticketPriceName = in.readString();
        price = in.readString();
        amount = in.readInt();
        ticketType = in.readInt();
        tripScenicTicketItemId = in.readInt();
        changeType = in.readInt();
        isDate = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(scenicTicketTypeId);
        dest.writeString(ticketPriceName);
        dest.writeString(price);
        dest.writeInt(amount);
        dest.writeInt(ticketType);
        dest.writeInt(tripScenicTicketItemId);
        dest.writeInt(changeType);
        dest.writeInt(isDate);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<TripScenicTicketBean> CREATOR = new Creator<TripScenicTicketBean>() {
        @Override
        public TripScenicTicketBean createFromParcel(Parcel in) {
            return new TripScenicTicketBean(in);
        }

        @Override
        public TripScenicTicketBean[] newArray(int size) {
            return new TripScenicTicketBean[size];
        }
    };

    public String getScenicTicketTypeId() {
        return scenicTicketTypeId;
    }

    public void setScenicTicketTypeId(String scenicTicketTypeId) {
        this.scenicTicketTypeId = scenicTicketTypeId;
    }

    public int getChangeType() {
        return changeType;
    }

    public void setChangeType(int changeType) {
        this.changeType = changeType;
    }

    public int getTripScenicTicketItemId() {
        return tripScenicTicketItemId;
    }

    public void setTripScenicTicketItemId(int tripScenicTicketItemId) {
        this.tripScenicTicketItemId = tripScenicTicketItemId;
    }

    public int getTicketType() {
        return ticketType;
    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTicketPriceName() {
        return ticketPriceName;
    }

    public void setTicketPriceName(String ticketPriceName) {
        this.ticketPriceName = ticketPriceName;
    }

    public int getIsDate() {
        return isDate;
    }

    public void setIsDate(int isDate) {
        this.isDate = isDate;
    }
}
