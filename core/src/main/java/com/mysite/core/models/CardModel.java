package com.mysite.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

    @Model(adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class CardModel {

        @ValueMapValue
        private String cardTitle;

        @ValueMapValue
        private String cardDescription;

        @ValueMapValue
        private String cardIcon;

        // Getters
        public String getCardTitle() {
            return cardTitle;
        }

        public String getCardDescription() {
            return cardDescription;
        }

        public String getCardIcon() {
            return cardIcon;
        }

    }

