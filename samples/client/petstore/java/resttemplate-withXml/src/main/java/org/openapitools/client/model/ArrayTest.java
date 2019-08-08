/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ReadOnlyFirst;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * ArrayTest
 */

@XmlRootElement(name = "ArrayTest")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "ArrayTest")
public class ArrayTest {
  @JsonProperty("array_of_string")
  // Is a container wrapped=false
  // items.name=arrayOfString items.baseName=arrayOfString items.xmlName= items.xmlNamespace=
  // items.example= items.type=String
  @XmlElement(name = "arrayOfString")
  private List<String> arrayOfString = new ArrayList<String>();

  @JsonProperty("array_array_of_integer")
  // Is a container wrapped=false
  // items.name=arrayArrayOfInteger items.baseName=arrayArrayOfInteger items.xmlName= items.xmlNamespace=
  // items.example= items.type=List&lt;Long&gt;
  @XmlElement(name = "arrayArrayOfInteger")
  private List<List<Long>> arrayArrayOfInteger = new ArrayList<List<Long>>();

  @JsonProperty("array_array_of_model")
  // Is a container wrapped=false
  // items.name=arrayArrayOfModel items.baseName=arrayArrayOfModel items.xmlName= items.xmlNamespace=
  // items.example= items.type=List&lt;ReadOnlyFirst&gt;
  @XmlElement(name = "arrayArrayOfModel")
  private List<List<ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<List<ReadOnlyFirst>>();

  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<String>();
    }
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

   /**
   * Get arrayOfString
   * @return arrayOfString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getArrayOfString() {
    return arrayOfString;
  }

  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<List<Long>>();
    }
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

   /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<List<ReadOnlyFirst>>();
    }
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

   /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
