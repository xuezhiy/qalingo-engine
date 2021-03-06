/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.pojo.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hoteia.qalingo.core.pojo.AssetPojo;
import org.hoteia.qalingo.core.pojo.retailer.RetailerPojo;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class ProductSkuPojo {

    private Long id;
    private int version;
    private String code;
    private String name;
    private String i18nName;
    private Integer width;
    private Integer height;
    private Integer length;
    private Integer weight;
    private String defaultPackshotImage;
    private String defaultBackgroundImage;
    private String defaultIconImage;
    private String priceWithStandardCurrencySign;
    private String description;
    private boolean isDefault;
    private int ranking;
    
    private Date dateCreate;
    private Date dateUpdate;
    
    private ProductMarketingPojo productMarketing;

    private List<ProductSkuAttributePojo> productSkuGlobalAttributes = new ArrayList<ProductSkuAttributePojo>();
    private List<ProductSkuAttributePojo> productSkuMarketAreaAttributes = new ArrayList<ProductSkuAttributePojo>();
    
    protected List<AssetPojo> assets = new ArrayList<AssetPojo>();
    private List<ProductSkuPricePojo> prices = new ArrayList<ProductSkuPricePojo>();
    private List<ProductSkuStockPojo> stocks = new ArrayList<ProductSkuStockPojo>();
    private List<RetailerPojo> retailers = new ArrayList<RetailerPojo>();

    private String detailsUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getI18nName() {
        return i18nName;
    }
    
    public void setI18nName(String i18nName) {
        this.i18nName = i18nName;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getDefaultPackshotImage() {
        return defaultPackshotImage;
    }

    public void setDefaultPackshotImage(String defaultPackshotImage) {
        this.defaultPackshotImage = defaultPackshotImage;
    }

    public String getDefaultBackgroundImage() {
        return defaultBackgroundImage;
    }

    public void setDefaultBackgroundImage(String defaultBackgroundImage) {
        this.defaultBackgroundImage = defaultBackgroundImage;
    }

    public String getDefaultIconImage() {
        return defaultIconImage;
    }

    public void setDefaultIconImage(String defaultIconImage) {
        this.defaultIconImage = defaultIconImage;
    }

    public String getPriceWithStandardCurrencySign() {
        return priceWithStandardCurrencySign;
    }
    
    public void setPriceWithStandardCurrencySign(String priceWithStandardCurrencySign) {
        this.priceWithStandardCurrencySign = priceWithStandardCurrencySign;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRanking() {
        return ranking;
    }
    
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @JsonBackReference
    public ProductMarketingPojo getProductMarketing() {
        return productMarketing;
    }

    public void setProductMarketing(ProductMarketingPojo productMarketing) {
        this.productMarketing = productMarketing;
    }

    public List<ProductSkuAttributePojo> getProductSkuGlobalAttributes() {
        return productSkuGlobalAttributes;
    }

    public void setProductSkuGlobalAttributes(List<ProductSkuAttributePojo> productSkuGlobalAttributes) {
        this.productSkuGlobalAttributes = productSkuGlobalAttributes;
    }

    public List<ProductSkuAttributePojo> getProductSkuMarketAreaAttributes() {
        return productSkuMarketAreaAttributes;
    }

    public void setProductSkuMarketAreaAttributes(List<ProductSkuAttributePojo> productSkuMarketAreaAttributes) {
        this.productSkuMarketAreaAttributes = productSkuMarketAreaAttributes;
    }

    public List<AssetPojo> getAssets() {
        return assets;
    }

    public String getAssetPath(String type) {
        for (Iterator<AssetPojo> iterator = assets.iterator(); iterator.hasNext();) {
            AssetPojo assetViewBean = (AssetPojo) iterator.next();
            if (assetViewBean.getType().equals(type)) {
                return assetViewBean.getPath();
            }
        }
        return null;
    }

    public String getAssetAbsoluteWebPath(String type) {
        for (Iterator<AssetPojo> iterator = assets.iterator(); iterator.hasNext();) {
            AssetPojo assetViewBean = (AssetPojo) iterator.next();
            if (assetViewBean.getType().equals(type)) {
                return assetViewBean.getAbsoluteWebPath();
            }
        }
        return null;
    }

    public String getAssetRelativeWebPath(String type) {
        for (Iterator<AssetPojo> iterator = assets.iterator(); iterator.hasNext();) {
            AssetPojo assetViewBean = (AssetPojo) iterator.next();
            if (assetViewBean.getType().equals(type)) {
                return assetViewBean.getRelativeWebPath();
            }
        }
        return null;
    }

    public void setAssets(List<AssetPojo> assets) {
        this.assets = assets;
    }

    public List<ProductSkuPricePojo> getPrices() {
        return prices;
    }

    public void setPrices(List<ProductSkuPricePojo> prices) {
        this.prices = prices;
    }

    public List<ProductSkuStockPojo> getStocks() {
        return stocks;
    }

    public void setStocks(List<ProductSkuStockPojo> stocks) {
        this.stocks = stocks;
    }

    public List<RetailerPojo> getRetailers() {
        return retailers;
    }

    public void setRetailers(List<RetailerPojo> retailers) {
        this.retailers = retailers;
    }
    
    public String getDetailsUrl() {
        return detailsUrl;
    }
    
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }
    
}