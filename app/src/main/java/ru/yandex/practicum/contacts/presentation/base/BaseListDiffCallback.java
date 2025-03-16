package ru.yandex.practicum.contacts.presentation.base;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <T extends ListDiffInterface <T>> extends DiffUtil.ItemCallback<T> {
    //@Override
    @Override
    public boolean areItemsTheSame(T oldItem, T newItem) {
        return oldItem.theSameAs(newItem);
    }
    //@Override
    boolean theSameAs(T newItem) {
        return this.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(T oldItem, T newItem) {
        return oldItem.equals(newItem);
    }

    //@Nullable
    @Override
    public Object getChangePayload(T oldItem, T newItem) {
        return newItem;
    }
}