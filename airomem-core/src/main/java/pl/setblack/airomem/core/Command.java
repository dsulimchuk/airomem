/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.setblack.airomem.core;

/**
 *
 * @author jratajsk
 */
@FunctionalInterface
public interface Command<T extends Storable> extends ContextCommand<T> {
    default  void execute(T system, PrevalanceContext context) {
        this.execute(system);
    }
    
    
    void execute(T system);
}