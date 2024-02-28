package co.edu.uniquindio.DesignPatterns.Exercise_5.model;

import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.BrandGraphicCard;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.QualityItem;
import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Extends.Fans;

public class GraphicCard {
    private Fans fans;
    private BrandGraphicCard brandGraphicCard;
    private QualityItem qualityItem;

    public GraphicCard(Fans fans, BrandGraphicCard brandGraphicCard, QualityItem qualityItem) {
        this.fans = fans;
        this.brandGraphicCard = brandGraphicCard;
        this.qualityItem = qualityItem;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public BrandGraphicCard getBrandGraphicCard() {
        return brandGraphicCard;
    }

    public void setBrandGraphicCard(BrandGraphicCard brandGraphicCard) {
        this.brandGraphicCard = brandGraphicCard;
    }

    public QualityItem getQualityItem() {
        return qualityItem;
    }

    public void setQualityItem(QualityItem qualityItem) {
        this.qualityItem = qualityItem;
    }
}
