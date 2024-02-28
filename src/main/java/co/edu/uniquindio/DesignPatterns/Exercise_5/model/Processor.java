package co.edu.uniquindio.DesignPatterns.Exercise_5.model;

import co.edu.uniquindio.DesignPatterns.Exercise_5.model.Enum.BrandProcessor;

public class Processor {
    private String chip;
    private BrandProcessor brandProcessor;
    private int nuclei;
    private int yarns;

    public Processor(String chip, BrandProcessor brandProcessor, int nuclei, int yarns) {
        this.chip = chip;
        this.brandProcessor = brandProcessor;
        this.nuclei = nuclei;
        this.yarns = yarns;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public BrandProcessor getBrandProcessor() {
        return brandProcessor;
    }

    public void setBrandProcessor(BrandProcessor brandProcessor) {
        this.brandProcessor = brandProcessor;
    }

    public int getNuclei() {
        return nuclei;
    }

    public void setNuclei(int nuclei) {
        this.nuclei = nuclei;
    }

    public int getYarns() {
        return yarns;
    }

    public void setYarns(int yarns) {
        this.yarns = yarns;
    }
}
