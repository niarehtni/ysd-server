						<tbody>
							<tr><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">业务类型：</td>
								<td style="">
									<select id="businessType" name="borrow.businessType" onchange="showContractInfo()" class="kaqu_w101">
<#if btp==7>
										<option value="01" <#if raiseTypeCode=='01'>selected</#if> >房产</option>
										<option value="02" <#if raiseTypeCode=='02'>selected</#if> >汽车</option>
										<option value="12" <#if raiseTypeCode=='12'>selected </#if> >奢品贷</option>
<#elseif btp==8>
										<option value="01" <#if raiseTypeCode=='01'>selected</#if> >房产</option>
										<option value="02" <#if raiseTypeCode=='02'>selected</#if> >汽车</option>
										<option value="03" <#if raiseTypeCode=='03'>selected</#if> >动产</option>
										<option value="04" <#if raiseTypeCode=='04'>selected</#if> >保证</option>
										<option value="13" <#if raiseTypeCode == '13'>selected </#if> >益老贷</option>
										<option value="14" <#if raiseTypeCode == '14'>selected </#if> >券贷通</option>
										<option value="15" <#if raiseTypeCode=='15'>selected</#if> >转贷宝</option>
<#elseif btp==9>
										<option value="11" <#if raiseTypeCode=='11'>selected</#if> >信用</option>
<#elseif btp==10>
										<option value="99" <#if raiseTypeCode=='99'>selected</#if> >体验</option>
										
<#elseif btp==11>						
										<option value="01" <#if raiseTypeCode=='01'>selected</#if> >房产</option>
										<option value="02" <#if raiseTypeCode=='02'>selected</#if> >汽车</option>
										<option value="03" <#if raiseTypeCode=='03'>selected</#if> >动产</option>
										<option value="04" <#if raiseTypeCode=='04'>selected</#if> >保证</option>
</#if>
									</select>
								</td>
							</tr>
							<#--><#if raiseTypeCode=='04'>-->
								<tr><td class="text_r org grayBg" width="40"></td>
									<td class="text_r grayBg" width="100">业务子类型：</td>
									<td style="">
										<select id="businessType" name="borrow.businessTypeSub" class="kaqu_w101">
											<option value="2001">企业（占无合同）</option>
											<option value="2002">个人</option>
										</select>
									</td>
								</tr>
						<#--	</#if>-->
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">借款归还方：</td>
								<td style="">
									<input type="text" value=""  name ="bankName" id="contractMove_bankName" class="input2 w_252"/>
								</td>
							</tr>
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">归还编号：</td>
								<td style="">
									<input type="text" value=""  name ="bankContractId" id="contractMove_bankContractId" class="input2 w_252"/>
								</td>
							</tr>
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">归还金额：</td>
								<td style="">
									<input type="text" value=""  name ="bankMoney" id="contractMove_bankMoney" class="input2 w_252"/>
								</td>
							</tr>
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">归还金额大写：</td>
								<td style="">
									<input type="text" value="" name ="bankMoneyBig" id="contractMove_bankMoneyBig" class="input2 w_252"/>
								</td>
							</tr>
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">受托人：</td>
								<td style="">
									<input type="text" value="" name ="consignee" id="contractMove_consignee" class="input2 w_252"/>
								</td>
							</tr>
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">受托人身份证：</td>
								<td style="">
									<input type="text" value="" name ="consigneeCardId" id="contractMove_consigneeCardId" class="input2 w_252"/>
								</td>
							</tr>
							<tr class="contract_param" ><td class="text_r org grayBg" width="40"></td>
								<td class="text_r grayBg" width="100">居间介绍方：</td>
								<td style="">
									<input type="text" value="" name ="introduce" id="contractMove_introduce" class="input2 w_252"/>
								</td>
							</tr>
							
						</tbody>
					
     
