package com.mysite.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

    @Model(adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class BannerModel {

        @ValueMapValue
        private String bannerTitle;

        @ValueMapValue
        private String bannerSubtitle;

        @ValueMapValue
        private String bannerImage;

        @ValueMapValue
        private String ctaText;

        @ValueMapValue
        private String ctaLink;

        // Getters
        public String getBannerTitle() {
            return bannerTitle;
        }

        public String getBannerSubtitle() {
            return bannerSubtitle;
        }

        public String getBannerImage() {
            return bannerImage;
        }

        public String getCtaText() {
            return ctaText != null ? ctaText : "Learn More";
        }

        public String getCtaLink() {
            return ctaLink;
        }
    }

