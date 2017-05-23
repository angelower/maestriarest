/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.servicio;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ASANTAANA
 */
@javax.ws.rs.ApplicationPath("webresources")//De ahí para allá convierte los directorios URI de REST
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.udea.servicio.CustomerFacadeREST.class);
        resources.add(com.udea.servicio.DiscountCodeFacadeREST.class);
        resources.add(com.udea.servicio.MicroMarketFacadeREST.class);
        resources.add(com.udea.servicio.NewCrossOriginResourceSharingFilter.class);
    }
    
}
