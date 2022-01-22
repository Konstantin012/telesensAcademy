package com.academy.serialization;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Сериализация — это процесс сохранения состояния объекта в последовательность байт.
 * Десериализация — это процесс восстановления объекта из этих байт.
 *
 * 1 шаг. =>  Реализовать интерфейс Serializable.
 * Этот интерфейс не определяет никаких методов ----> интерфейс-маркер <-------,
 * просто он служит указателем системе, что объект, реализующий его, может быть сериализован.
 *
 * 2 шаг. =>
 *
 */

public class GameSerialize implements Serializable {

        private static final long serialVersionUID = 1L;

        private String[] territoriesInfo;
        private String[] resourcesInfo;
        private String[] diplomacyInfo;

        public GameSerialize(String[] territoriesInfo, String[] resourcesInfo, String[] diplomacyInfo){
            this.territoriesInfo = territoriesInfo;
            this.resourcesInfo = resourcesInfo;
            this.diplomacyInfo = diplomacyInfo;
        }

        public String[] getTerritoriesInfo() {
            return territoriesInfo;
        }

        public void setTerritoriesInfo(String[] territoriesInfo) {
            this.territoriesInfo = territoriesInfo;
        }

        public String[] getResourcesInfo() {
            return resourcesInfo;
        }

        public void setResourcesInfo(String[] resourcesInfo) {
            this.resourcesInfo = resourcesInfo;
        }

        public String[] getDiplomacyInfo() {
            return diplomacyInfo;
        }

        public void setDiplomacyInfo(String[] diplomacyInfo) {
            this.diplomacyInfo = diplomacyInfo;
        }

        @Override
        public String toString() {
            return "SavedGame{" +
                    "territoriesInfo=" + Arrays.toString(territoriesInfo) +
                    ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                    ", diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                    '}';
        }
    }

