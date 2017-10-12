/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.esb

import com.google.common.eventbus.AllowConcurrentEvents
import com.google.common.eventbus.Subscribe
import com.mycollab.common.dao.OptionValMapper
import com.mycollab.common.domain.OptionVal
import com.mycollab.common.domain.OptionValExample
import com.mycollab.module.esb.GenericCommand
import org.springframework.stereotype.Component
import java.util.*

/**
 * @author MyCollab Ltd
 * @since 6.0.0
 */
@Component
class AddProjectCommand(private val optionValMapper: OptionValMapper) : GenericCommand() {

    @AllowConcurrentEvents
    @Subscribe
    fun addProject(event: AddProjectEvent) {
        val ex = OptionValExample()
        ex.createCriteria().andIsdefaultEqualTo(true).andSaccountidEqualTo(event.accountId)

        val defaultOptions = optionValMapper.selectByExample(ex)
        defaultOptions.forEach { option ->
            val prjOption = OptionVal()
            prjOption.createdtime = GregorianCalendar().time
            prjOption.description = option.description
            prjOption.extraid = event.projectId
            prjOption.isdefault = false
            prjOption.saccountid = event.accountId
            prjOption.type = option.type
            prjOption.typeval = option.typeval
            prjOption.fieldgroup = option.fieldgroup
            prjOption.refoption = option.id
            prjOption.color = "fdde86"
            optionValMapper.insert(prjOption)
        }
    }
}