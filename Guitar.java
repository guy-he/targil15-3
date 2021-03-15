package com.company;

import lombok.Getter;
import lombok.Setter;

public class Guitar {
    private final @Getter String m_brand;
     private final @Getter boolean m_is_electric;
    private final @Getter int m_number_of_strings;
    private @Getter @Setter float m_price;     /// :-)
    private @Getter boolean  m_istuned;

    public void tuneGuitar(){
        m_istuned = true;
        System.out.println("guitar is now tuned! rock 'n' roll!!!!!");
    }
    //hellp

    public Guitar(String m_brand, boolean m_is_electric, int m_number_of_strings, float m_price, boolean m_istuned){
        this.m_brand = m_brand;
        this.m_is_electric = m_is_electric;
        this.m_number_of_strings = m_number_of_strings;
        this.m_price = m_price;
        this.m_istuned = m_istuned;

    }
    public Guitar (String m_brand, boolean m_is_electric){
        this(m_brand, m_is_electric, 6, 50, true);
    }

    public Guitar(String m_brand){
        this(m_brand, false, 6, 50, true);
    }

}
