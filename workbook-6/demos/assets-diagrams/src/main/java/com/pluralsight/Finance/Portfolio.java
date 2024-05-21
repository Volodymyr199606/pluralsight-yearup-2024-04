package com.pluralsight.Finance;

import com.pluralsight.Valuable;

public class Portfolio
{
    private String name;
    private String owner;
    private Valuable[] assets;

    public Portfolio(String name, String owner)
    {
        this.name = name;
        this.owner = owner;
        this.assets = new Valuable[0];
    }

    public void add(Valuable asset)
    {
        Valuable[] newAssets = new Valuable[this.assets.length + 1];
        for (int i = 0; i < this.assets.length; i++)
        {
            newAssets[i] = this.assets[i];
        }
        newAssets[this.assets.length] = asset;
        this.assets = newAssets;
    }

    public double getValue()
    {
        double totalValue = 0;
        for (Valuable asset : this.assets)
        {
            totalValue += asset.getValue();
        }
        return totalValue;
    }
}
